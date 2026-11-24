.class public final synthetic Lcom/appsflyer/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFc1tSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1tSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFc1tSDK;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFc1tSDK;

    check-cast p1, Lcom/google/android/gms/appset/AppSetIdInfo;

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1tSDK;->a(Lcom/appsflyer/internal/AFc1tSDK;Lcom/google/android/gms/appset/AppSetIdInfo;)V

    return-void
.end method
