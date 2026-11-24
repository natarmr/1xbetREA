.class public final synthetic La/i7g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/r9u;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i7g0;->a:B

    iput-object p1, p0, La/i7g0;->b:La/r9u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i7g0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/i7g0;->b:La/r9u;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/g0m0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/h0m0;

    .line 14
    .line 15
    iget-object p1, p1, La/g0m0;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v1, La/ygp;->t:La/ygp;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-direct {v0, p1, p0}, La/h0m0;-><init>(La/a4x;Z)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    check-cast p1, La/e7g0;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/ygp;->t:La/ygp;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    iget-object p1, p1, La/e7g0;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    new-instance p1, La/g7g0;

    .line 71
    .line 72
    invoke-direct {p1, p0}, La/g7g0;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v0, La/f7g0;

    .line 77
    .line 78
    invoke-static {p1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-direct {v0, p1, p0}, La/f7g0;-><init>(La/a4x;Z)V

    .line 83
    .line 84
    .line 85
    move-object p1, v0

    .line 86
    :goto_0
    return-object p1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
