.class public abstract La/qu90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/er90;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/er90;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/er90;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/qu90;->a:La/er90;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    invoke-static {v0, v0, v0, v0, v1}, La/r4e;->b(IIIII)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, La/qu90;->b:J

    .line 17
    .line 18
    return-void
.end method
