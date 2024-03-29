package com.ddastudio.auth.accounts;


import com.ddastudio.auth.common.audit.Audit;
import com.ddastudio.auth.common.audit.AuditListener;
import com.ddastudio.auth.common.audit.Auditable;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Auditable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String phoneNo;
    @NotNull
    private Integer appId;
    private String name;
    private String avatar;
    private String role;
    private String captainYn;
    private String provider;
    private String providerUid;
    private LocalDate cancelDate;
    private String email;
    private String pw;
    private String refresh_token;
    private String emailCheck;
    private String accountStatus;
    private String smsVerifyNo;

    @Embedded
    private Audit audit;

}
