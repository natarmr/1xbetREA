.class public final La/dhw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/v4x0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, La/ygw0;->c:La/owp0;

    .line 2
    .line 3
    iget-object v0, v0, La/owp0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/fbv;

    .line 6
    .line 7
    new-instance v1, La/v4x0;

    .line 8
    .line 9
    const-string v2, "measurement.service.storage_consent_support_version"

    .line 10
    .line 11
    const-wide/32 v3, 0x31b50

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3, v4}, La/v4x0;-><init>(Ljava/lang/String;La/fbv;J)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/dhw0;->a:La/v4x0;

    .line 18
    .line 19
    return-void
.end method
