.class public final synthetic La/o72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s72;


# direct methods
.method public synthetic constructor <init>(La/s72;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o72;->a:B

    iput-object p1, p0, La/o72;->b:La/s72;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o72;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/o72;->b:La/s72;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 29
    .line 30
    move-object v5, v3

    .line 31
    check-cast v5, La/g72;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v9, La/c72;

    .line 37
    .line 38
    invoke-direct {v9, v1}, La/c72;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const v18, 0x7f7ef

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v15, 0x0

    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    invoke-static/range {v5 .. v18}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    new-instance v2, La/a72;

    .line 79
    .line 80
    iget-object v3, v0, La/s72;->u:La/ctf0;

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
    invoke-virtual {v3, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v2, v1}, La/a72;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, Ljava/lang/Throwable;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v2, v0, La/s72;->B:La/ivn;

    .line 112
    .line 113
    new-instance v3, La/o72;

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    invoke-direct {v3, v0, v4}, La/o72;-><init>(La/s72;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
