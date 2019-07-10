package com.ddastudio.auth.common.audit;

public interface Auditable {
    Audit getAudit();
    void setAudit(Audit audit);
}
