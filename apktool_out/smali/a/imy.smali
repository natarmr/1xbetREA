.class public final La/imy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:La/ey40;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12c

    .line 5
    .line 6
    iput v0, p0, La/imy;->a:I

    .line 7
    .line 8
    sget-object v0, La/hkx;->a:La/ey40;

    .line 9
    .line 10
    new-instance v0, La/ey40;

    .line 11
    .line 12
    invoke-direct {v0}, La/ey40;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/imy;->b:La/ey40;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)La/hmy;
    .locals 2

    .line 1
    new-instance v0, La/hmy;

    .line 2
    .line 3
    sget-object v1, La/ihn;->d:La/z73;

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, La/hmy;-><init>(Ljava/lang/Object;La/ghn;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/imy;->b:La/ey40;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, La/ey40;->j(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
