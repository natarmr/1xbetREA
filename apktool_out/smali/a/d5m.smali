.class public final synthetic La/d5m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/String;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-byte p1, p0, La/d5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/d5m;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/d5m;->b:J

    iput-boolean p5, p0, La/d5m;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(IJLkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 2
    const/4 p1, 0x3

    iput-byte p1, p0, La/d5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/d5m;->b:J

    iput-boolean p5, p0, La/d5m;->c:Z

    iput-object p4, p0, La/d5m;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JLa/on20;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/d5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/d5m;->b:J

    iput-object p3, p0, La/d5m;->d:Ljava/lang/Object;

    iput-boolean p4, p0, La/d5m;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function0;ZI)V
    .locals 0

    .line 4
    const/4 p5, 0x2

    iput-byte p5, p0, La/d5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/d5m;->b:J

    iput-object p3, p0, La/d5m;->d:Ljava/lang/Object;

    iput-boolean p4, p0, La/d5m;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d5m;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/d5m;->d:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v7, v3

    .line 12
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    move-object/from16 v8, p1

    .line 15
    .line 16
    check-cast v8, La/fet;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, La/x8x;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget-wide v4, v0, La/d5m;->b:J

    .line 30
    .line 31
    iget-boolean v6, v0, La/d5m;->c:Z

    .line 32
    .line 33
    invoke-static/range {v4 .. v9}, La/q7x;->s(JZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    move-object/from16 v5, p1

    .line 42
    .line 43
    check-cast v5, La/fet;

    .line 44
    .line 45
    move-object/from16 v1, p2

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-wide v1, v0, La/d5m;->b:J

    .line 57
    .line 58
    iget-boolean v4, v0, La/d5m;->c:Z

    .line 59
    .line 60
    invoke-static/range {v1 .. v6}, La/dm40;->c(JLkotlin/jvm/functions/Function0;ZLa/fet;I)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_1
    check-cast v3, La/on20;

    .line 67
    .line 68
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, La/oyg0;

    .line 71
    .line 72
    move-object/from16 v4, p2

    .line 73
    .line 74
    check-cast v4, La/a820;

    .line 75
    .line 76
    iget-object v5, v4, La/a820;->b:La/txe;

    .line 77
    .line 78
    sget v1, La/on20;->m1:I

    .line 79
    .line 80
    invoke-virtual {v3}, La/on20;->c0()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    const/4 v13, 0x0

    .line 85
    const/16 v14, 0x5c

    .line 86
    .line 87
    iget-wide v6, v0, La/d5m;->b:J

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    iget-boolean v12, v0, La/d5m;->c:Z

    .line 93
    .line 94
    invoke-static/range {v5 .. v14}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const/16 v20, 0x0

    .line 99
    .line 100
    const v21, 0x3fffd

    .line 101
    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v14, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :pswitch_2
    move-object v5, v3

    .line 123
    check-cast v5, Ljava/lang/String;

    .line 124
    .line 125
    move-object/from16 v4, p1

    .line 126
    .line 127
    check-cast v4, La/fet;

    .line 128
    .line 129
    move-object/from16 v1, p2

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v2}, La/x8x;->L(I)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget-wide v2, v0, La/d5m;->b:J

    .line 141
    .line 142
    iget-boolean v6, v0, La/d5m;->c:Z

    .line 143
    .line 144
    invoke-static/range {v1 .. v6}, La/thb;->p(IJLa/fet;Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
