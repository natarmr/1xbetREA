.class public abstract La/mk9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:La/ugg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42200000    # 40.0f

    .line 4
    .line 5
    sput v0, La/mk9;->a:F

    .line 6
    .line 7
    const/high16 v1, 0x42000000    # 32.0f

    .line 8
    .line 9
    sput v1, La/mk9;->b:F

    .line 10
    .line 11
    sput v0, La/mk9;->c:F

    .line 12
    .line 13
    const/high16 v0, 0x41400000    # 12.0f

    .line 14
    .line 15
    invoke-static {v0}, La/vgg0;->a(F)La/ugg0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/mk9;->d:La/ugg0;

    .line 20
    .line 21
    return-void
.end method
