.class public interface abstract Lcom/huawei/hms/support/feature/service/AuthService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/common/HuaweiApiInterface;


# virtual methods
.method public abstract cancelAuthorization()La/duo0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/duo0;"
        }
    .end annotation
.end method

.method public abstract getSignInIntent()Landroid/content/Intent;
.end method

.method public abstract signOut()La/duo0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/duo0;"
        }
    .end annotation
.end method
