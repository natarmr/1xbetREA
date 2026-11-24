.class public abstract La/f6v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lh80;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, La/s5x0;->t(FFI)La/lh80;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/f6v0;->a:La/lh80;

    .line 12
    .line 13
    return-void
.end method
