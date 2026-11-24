.class public final synthetic La/a85;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g85;


# direct methods
.method public synthetic constructor <init>(La/g85;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a85;->a:B

    iput-object p1, p0, La/a85;->b:La/g85;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/a85;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/a85;->b:La/g85;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v0, p1, La/jfp;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, La/p75;

    .line 18
    .line 19
    iget-object v0, p0, La/g85;->p:La/ctf0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    new-array v2, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v3, v0, La/ctf0;->b:La/lsm0;

    .line 25
    .line 26
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const v4, 0x7f1307bb

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-array v3, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v4, v0, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const v5, 0x7f1303d7

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-array v4, v1, [Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 55
    .line 56
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const v4, 0x7f130e5d

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p1, v2, v3, v0}, La/p75;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, La/g85;->w:La/duj;

    .line 75
    .line 76
    new-instance v1, La/fa2;

    .line 77
    .line 78
    const/16 v2, 0xf

    .line 79
    .line 80
    invoke-direct {v1, p0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, La/g85;->w:La/duj;

    .line 93
    .line 94
    new-instance v0, La/o33;

    .line 95
    .line 96
    const/16 v1, 0x1d

    .line 97
    .line 98
    invoke-direct {v0, v1}, La/o33;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
