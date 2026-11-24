.class public final synthetic La/ku70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bv70;


# direct methods
.method public synthetic constructor <init>(La/bv70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ku70;->a:B

    iput-object p1, p0, La/ku70;->b:La/bv70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ku70;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ku70;->b:La/bv70;

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
    sget-object v1, La/xt70;->a:La/xt70;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 34
    .line 35
    move-object v4, v2

    .line 36
    check-cast v4, La/hu70;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v21, La/iun;->a:La/iun;

    .line 42
    .line 43
    const/16 v23, 0x0

    .line 44
    .line 45
    const v24, 0x1d1fef

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    const/16 v18, 0x1

    .line 64
    .line 65
    const-string v19, "English"

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    const/16 v22, 0x0

    .line 70
    .line 71
    invoke-static/range {v4 .. v24}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_0
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, La/bv70;->R()V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
