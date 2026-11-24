.class public abstract La/vwv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/nul0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/high16 v3, 0x43c80000    # 400.0f

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/vwv0;->a:La/nul0;

    .line 12
    .line 13
    return-void
.end method
