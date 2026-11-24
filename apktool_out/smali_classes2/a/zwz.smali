.class public final synthetic La/zwz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zwz;->a:B

    iput-object p1, p0, La/zwz;->b:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zwz;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "CURRENT_TAB_KEY"

    .line 7
    .line 8
    iget-object v0, v0, La/zwz;->b:La/pru;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/vzg0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/sff0;->f:La/ucq;

    .line 25
    .line 26
    sget-object v5, La/iun;->a:La/iun;

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v1, v3, v2}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-boolean v10, v0, La/ucq;->l:Z

    .line 43
    .line 44
    iget-boolean v11, v0, La/ucq;->m:Z

    .line 45
    .line 46
    iget-boolean v12, v0, La/ucq;->i:Z

    .line 47
    .line 48
    iget-boolean v13, v0, La/ucq;->j:Z

    .line 49
    .line 50
    iget-boolean v14, v0, La/ucq;->k:Z

    .line 51
    .line 52
    new-instance v4, La/l400;

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    const/4 v9, 0x0

    .line 56
    move-object v6, v5

    .line 57
    invoke-direct/range {v4 .. v14}, La/l400;-><init>(Ljava/util/List;Ljava/util/List;IZZZZZZZ)V

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_0
    move-object/from16 v1, p1

    .line 62
    .line 63
    check-cast v1, La/vzg0;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v5, La/iun;->a:La/iun;

    .line 73
    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v1, v3, v2}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    iget-object v0, v0, La/sff0;->f:La/ucq;

    .line 89
    .line 90
    iget-boolean v10, v0, La/ucq;->l:Z

    .line 91
    .line 92
    iget-boolean v11, v0, La/ucq;->i:Z

    .line 93
    .line 94
    iget-boolean v12, v0, La/ucq;->k:Z

    .line 95
    .line 96
    iget-boolean v13, v0, La/ucq;->o:Z

    .line 97
    .line 98
    iget-boolean v14, v0, La/ucq;->n:Z

    .line 99
    .line 100
    new-instance v4, La/uwz;

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const-string v15, ""

    .line 104
    .line 105
    const/4 v8, 0x1

    .line 106
    move-object v6, v5

    .line 107
    invoke-direct/range {v4 .. v15}, La/uwz;-><init>(Ljava/util/List;Ljava/util/List;IZZZZZZZLjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
