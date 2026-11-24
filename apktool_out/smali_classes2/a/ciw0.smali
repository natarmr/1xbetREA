.class public final La/ciw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/n4x0;

.field public static final b:La/n4x0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/ygw0;->c:La/owp0;

    .line 2
    .line 3
    const-string v1, "45753512"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, La/owp0;->k(Ljava/lang/String;Z)La/n4x0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sput-object v1, La/ciw0;->a:La/n4x0;

    .line 11
    .line 12
    const-string v1, "measurement.gbraid_campaign.stop_lgclid"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, La/owp0;->k(Ljava/lang/String;Z)La/n4x0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/ciw0;->b:La/n4x0;

    .line 19
    .line 20
    return-void
.end method
