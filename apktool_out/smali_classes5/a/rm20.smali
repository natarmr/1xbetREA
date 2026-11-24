.class public final synthetic La/rm20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g680;


# direct methods
.method public synthetic constructor <init>(La/g680;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rm20;->a:B

    iput-object p1, p0, La/rm20;->b:La/g680;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rm20;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1b

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, ""

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v6, p2

    .line 19
    .line 20
    check-cast v6, La/b820;

    .line 21
    .line 22
    iget-object v7, v6, La/b820;->a:La/ly6;

    .line 23
    .line 24
    iget-object v1, v7, La/ly6;->d:La/jur;

    .line 25
    .line 26
    new-instance v8, La/j43;

    .line 27
    .line 28
    sget-object v9, La/c0d;->a:La/c0d;

    .line 29
    .line 30
    invoke-direct {v8, v5, v5, v9, v4}, La/j43;-><init>(Ljava/lang/String;Ljava/lang/String;La/c0d;Z)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v8, v3, v2}, La/jur;->a(La/jur;La/j43;La/wbs0;I)La/jur;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    const/4 v10, 0x0

    .line 38
    const/16 v12, 0x57

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    iget-object v11, v0, La/rm20;->b:La/g680;

    .line 42
    .line 43
    invoke-static/range {v7 .. v12}, La/ly6;->a(La/ly6;La/htv;La/jur;La/f0d;La/g680;I)La/ly6;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x1ffe

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    invoke-static/range {v6 .. v19}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :pswitch_0
    move-object/from16 v1, p1

    .line 67
    .line 68
    check-cast v1, La/oyg0;

    .line 69
    .line 70
    move-object/from16 v6, p2

    .line 71
    .line 72
    check-cast v6, La/b820;

    .line 73
    .line 74
    iget-object v7, v6, La/b820;->a:La/ly6;

    .line 75
    .line 76
    iget-object v1, v7, La/ly6;->d:La/jur;

    .line 77
    .line 78
    new-instance v8, La/j43;

    .line 79
    .line 80
    sget-object v9, La/c0d;->a:La/c0d;

    .line 81
    .line 82
    invoke-direct {v8, v5, v5, v9, v4}, La/j43;-><init>(Ljava/lang/String;Ljava/lang/String;La/c0d;Z)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v8, v3, v2}, La/jur;->a(La/jur;La/j43;La/wbs0;I)La/jur;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    const/4 v10, 0x0

    .line 90
    const/16 v12, 0x57

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    iget-object v11, v0, La/rm20;->b:La/g680;

    .line 94
    .line 95
    invoke-static/range {v7 .. v12}, La/ly6;->a(La/ly6;La/htv;La/jur;La/f0d;La/g680;I)La/ly6;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const/16 v19, 0x1ffe

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    const/4 v13, 0x0

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
    invoke-static/range {v6 .. v19}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
