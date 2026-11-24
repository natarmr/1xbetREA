.class public abstract La/xmh0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:F

.field public static final c:La/ugg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x43100000    # 144.0f

    .line 4
    .line 5
    const/high16 v1, 0x42c00000    # 96.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, La/qbc;->i(FF)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, La/xmh0;->a:J

    .line 12
    .line 13
    const/high16 v0, 0x41000000    # 8.0f

    .line 14
    .line 15
    sput v0, La/xmh0;->b:F

    .line 16
    .line 17
    const/high16 v0, 0x41800000    # 16.0f

    .line 18
    .line 19
    invoke-static {v0}, La/vgg0;->a(F)La/ugg0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/xmh0;->c:La/ugg0;

    .line 24
    .line 25
    return-void
.end method
