.class public abstract La/vb5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zsf;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zsf;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const v3, 0x3dcccccd    # 0.1f

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v3, v3, v1, v2}, La/zsf;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/vb5;->a:La/zsf;

    .line 13
    .line 14
    return-void
.end method
