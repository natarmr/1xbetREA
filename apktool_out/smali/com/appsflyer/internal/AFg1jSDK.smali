.class public final Lcom/appsflyer/internal/AFg1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "playstore"

    .line 2
    .line 3
    const-string v1, "googleplaystore"

    .line 4
    .line 5
    const-string v2, "googleplay"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/appsflyer/internal/AFg1jSDK;->AFKeystoreWrapper:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFg1jSDK;->AFKeystoreWrapper:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
