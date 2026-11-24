.class public final La/hyw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/myw;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x280

    .line 4
    .line 5
    const/16 v2, 0x1e0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/m2a;->d:La/m2a;

    .line 11
    .line 12
    new-instance v2, La/jsf0;

    .line 13
    .line 14
    sget-object v3, La/v7k0;->b:Landroid/util/Size;

    .line 15
    .line 16
    invoke-direct {v2, v3}, La/jsf0;-><init>(Landroid/util/Size;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/isf0;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v1, v2, v4}, La/isf0;-><init>(La/m2a;La/jsf0;I)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/gyw;

    .line 26
    .line 27
    invoke-direct {v1, v4}, La/gyw;-><init>(B)V

    .line 28
    .line 29
    .line 30
    sget-object v2, La/w0x;->p0:La/u15;

    .line 31
    .line 32
    iget-object v1, v1, La/gyw;->b:La/wy40;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, La/fpt0;->G0:La/u15;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v0, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, La/w0x;->k0:La/u15;

    .line 48
    .line 49
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v0, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, La/w0x;->s0:La/u15;

    .line 57
    .line 58
    invoke-virtual {v1, v0, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, La/agn;->d:La/agn;

    .line 62
    .line 63
    invoke-virtual {v0, v0}, La/agn;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    sget-object v2, La/h0x;->j0:La/u15;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/myw;

    .line 75
    .line 76
    invoke-static {v1}, La/b780;->j(La/drd;)La/b780;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, La/myw;-><init>(La/b780;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, La/hyw;->a:La/myw;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    const-string v0, "ImageAnalysis currently only supports SDR"

    .line 87
    .line 88
    invoke-static {v0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method
