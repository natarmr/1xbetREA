.class public abstract La/szg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/qaj;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/qaj;

    .line 2
    .line 3
    invoke-direct {v0}, La/qaj;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/k0h0;->a:La/k0h0;

    .line 7
    .line 8
    sget-object v2, La/sre0;->a:La/tre0;

    .line 9
    .line 10
    const-class v3, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0, v3, v1}, La/qaj;->Z(La/sgy;La/jiy;)V

    .line 17
    .line 18
    .line 19
    const-class v1, La/qz40;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v3, La/awg0;

    .line 26
    .line 27
    const/4 v4, 0x7

    .line 28
    invoke-direct {v3, v4}, La/awg0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v3}, La/qaj;->G(La/sgy;Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, La/qaj;->b()La/qaj;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/qaj;

    .line 39
    .line 40
    invoke-direct {v1}, La/qaj;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v3, La/t7k0;->a:La/t7k0;

    .line 44
    .line 45
    const-class v4, Landroid/util/Size;

    .line 46
    .line 47
    invoke-virtual {v2, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v1, v4, v3}, La/qaj;->Z(La/sgy;La/jiy;)V

    .line 52
    .line 53
    .line 54
    sget-object v3, La/n7k0;->a:La/n7k0;

    .line 55
    .line 56
    const-class v4, Landroid/util/SizeF;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v1, v4, v3}, La/qaj;->Z(La/sgy;La/jiy;)V

    .line 63
    .line 64
    .line 65
    const-class v3, Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v3, La/awg0;

    .line 72
    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    invoke-direct {v3, v4}, La/awg0;-><init>(B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2, v3}, La/qaj;->G(La/sgy;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, La/qaj;->b()La/qaj;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, La/qhi0;->a:La/qaj;

    .line 86
    .line 87
    new-instance v2, La/qaj;

    .line 88
    .line 89
    invoke-direct {v2}, La/qaj;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, La/qaj;->c(La/phi0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, La/qaj;->c(La/phi0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, La/qaj;->b()La/qaj;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sput-object v0, La/szg0;->a:La/qaj;

    .line 103
    .line 104
    return-void
.end method

.method public static a(Lkotlin/jvm/functions/Function1;)La/rzg0;
    .locals 3

    .line 1
    sget-object v0, La/rzg0;->b:La/rzg0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/qzg0;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/rzg0;->a:La/qaj;

    .line 12
    .line 13
    iput-object v0, v1, La/qzg0;->a:La/qaj;

    .line 14
    .line 15
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    new-instance p0, La/rzg0;

    .line 19
    .line 20
    iget-object v0, v1, La/qzg0;->a:La/qaj;

    .line 21
    .line 22
    sget-object v1, La/qhi0;->a:La/qaj;

    .line 23
    .line 24
    sget-object v1, La/szg0;->a:La/qaj;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v2, La/qaj;

    .line 33
    .line 34
    invoke-direct {v2}, La/qaj;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, La/qaj;->c(La/phi0;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/ugf0;

    .line 41
    .line 42
    invoke-direct {v1, v2}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/qaj;->c(La/phi0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, La/qaj;->b()La/qaj;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, La/rzg0;-><init>(La/qaj;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method
