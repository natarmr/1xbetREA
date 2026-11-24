.class public final synthetic La/nkw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ukw;


# direct methods
.method public synthetic constructor <init>(La/ukw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nkw;->a:B

    iput-object p1, p0, La/nkw;->b:La/ukw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/nkw;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nkw;->b:La/ukw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/ukw;->B:La/duj;

    .line 14
    .line 15
    new-instance v0, La/x2w;

    .line 16
    .line 17
    const/16 v1, 0x12

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/x2w;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/ukw;->B:La/duj;

    .line 34
    .line 35
    new-instance v0, La/x2w;

    .line 36
    .line 37
    const/16 v1, 0x11

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/x2w;-><init>(B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/ukw;->B:La/duj;

    .line 54
    .line 55
    new-instance v0, La/x2w;

    .line 56
    .line 57
    const/16 v1, 0x16

    .line 58
    .line 59
    invoke-direct {v0, v1}, La/x2w;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    new-instance v0, La/sjw;

    .line 75
    .line 76
    new-instance v1, La/xdk0;

    .line 77
    .line 78
    sget-object v2, La/rek0;->b:La/rek0;

    .line 79
    .line 80
    iget-object v3, p0, La/ukw;->r:La/ctf0;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    new-array v5, v4, [Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 86
    .line 87
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v3, p1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const/4 v7, 0x0

    .line 96
    const/16 v8, 0x7c

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, La/sjw;-><init>(La/xdk0;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p0, p0, La/ukw;->B:La/duj;

    .line 119
    .line 120
    new-instance v0, La/x2w;

    .line 121
    .line 122
    const/16 v1, 0x14

    .line 123
    .line 124
    invoke-direct {v0, v1}, La/x2w;-><init>(B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
