.class public abstract La/suv0;
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
    const v3, 0x461c4000    # 10000.0f

    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3, v0, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, La/suv0;->a:La/nul0;

    .line 13
    .line 14
    return-void
.end method
