.class public final Lcom/appsflyer/internal/AFf1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final registerClient:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    sget-object v1, La/bfn;->e:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lcom/appsflyer/internal/AFf1wSDK;->registerClient:J

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic registerClient()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/appsflyer/internal/AFf1wSDK;->registerClient:J

    .line 2
    .line 3
    return-wide v0
.end method
