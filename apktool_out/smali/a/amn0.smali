.class public final synthetic La/amn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zy3;


# instance fields
.field public final synthetic a:La/cmn0;

.field public final synthetic b:La/bmn0;

.field public final synthetic c:I

.field public final synthetic d:La/i55;

.field public final synthetic e:La/i55;


# direct methods
.method public synthetic constructor <init>(La/cmn0;La/bmn0;ILa/i55;La/i55;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/amn0;->a:La/cmn0;

    iput-object p2, p0, La/amn0;->b:La/bmn0;

    iput p3, p0, La/amn0;->c:I

    iput-object p4, p0, La/amn0;->d:La/i55;

    iput-object p5, p0, La/amn0;->e:La/i55;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)La/ig00;
    .locals 8

    .line 1
    iget-object v0, p0, La/amn0;->b:La/bmn0;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    check-cast v2, Landroid/view/Surface;

    .line 5
    .line 6
    iget-object p1, p0, La/amn0;->a:La/cmn0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    :try_start_0
    invoke-virtual {v0}, La/hzj;->d()V
    :try_end_0
    .catch La/gzj; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    new-instance v1, La/imn0;

    .line 19
    .line 20
    iget-object p1, p1, La/cmn0;->g:La/h55;

    .line 21
    .line 22
    iget-object v4, p1, La/h55;->a:Landroid/util/Size;

    .line 23
    .line 24
    iget v3, p0, La/amn0;->c:I

    .line 25
    .line 26
    iget-object v5, p0, La/amn0;->d:La/i55;

    .line 27
    .line 28
    iget-object v6, p0, La/amn0;->e:La/i55;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, La/imn0;-><init>(Landroid/view/Surface;ILandroid/util/Size;La/i55;La/i55;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/yln0;

    .line 34
    .line 35
    invoke-direct {p0, v0, v7}, La/yln0;-><init>(La/bmn0;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v2, v1, La/imn0;->k:La/wu9;

    .line 43
    .line 44
    iget-object v2, v2, La/wu9;->b:La/vu9;

    .line 45
    .line 46
    invoke-virtual {v2, p0, p1}, La/y4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, La/bmn0;->q:La/imn0;

    .line 50
    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v7, 0x0

    .line 55
    :goto_0
    const-string p0, "Consumer can only be linked once."

    .line 56
    .line 57
    invoke-static {p0, v7}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    iput-object v1, v0, La/bmn0;->q:La/imn0;

    .line 61
    .line 62
    invoke-static {v1}, La/ro4;->a0(Ljava/lang/Object;)La/m3x;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    new-instance p1, La/m3x;

    .line 70
    .line 71
    invoke-direct {p1, p0, v7}, La/m3x;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    return-object p1
.end method
