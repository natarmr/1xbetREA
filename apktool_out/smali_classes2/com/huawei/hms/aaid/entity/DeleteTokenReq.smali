.class public Lcom/huawei/hms/aaid/entity/DeleteTokenReq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/IMessageEntity;


# instance fields
.field private appId:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private deleteType:I
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private isFastApp:Z
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private isMultiSender:Z
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private pkgName:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private projectId:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private scope:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private subjectId:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field

.field private token:Ljava/lang/String;
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isMultiSender:Z

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->deleteType:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isFastApp:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->appId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDeleteType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->deleteType:I

    .line 2
    .line 3
    return p0
.end method

.method public getPkgName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->pkgName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProjectId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->projectId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScope()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->scope:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSubjectId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->subjectId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getToken()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->token:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isFastApp()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isFastApp:Z

    .line 2
    .line 3
    return p0
.end method

.method public isMultiSender()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isMultiSender:Z

    .line 2
    .line 3
    return p0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->appId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setDeleteType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->deleteType:I

    .line 2
    .line 3
    return-void
.end method

.method public setFastApp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isFastApp:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMultiSender(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isMultiSender:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPkgName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->pkgName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setProjectId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->projectId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setScope(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->scope:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSubjectId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->subjectId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->token:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "{pkgName: "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->pkgName:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 22
    .line 23
    .line 24
    const-string v1, ",scope:"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->scope:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    const-string v1, ",appId:"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->appId:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    .line 43
    .line 44
    const-string v1, ",projectId:"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->projectId:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    .line 53
    .line 54
    const-string v1, ",subjectId:"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->subjectId:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->subjectId:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    .line 71
    .line 72
    const-string p0, "}"

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
