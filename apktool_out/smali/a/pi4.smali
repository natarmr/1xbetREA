.class public final synthetic La/pi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/pi4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pi4;->b:La/mm40;

    iput-object p2, p0, La/pi4;->c:La/l7m0;

    iput-boolean p3, p0, La/pi4;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/l7m0;ZI)V
    .locals 0

    .line 2
    const/4 p4, 0x0

    iput-byte p4, p0, La/pi4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pi4;->b:La/mm40;

    iput-object p2, p0, La/pi4;->c:La/l7m0;

    iput-boolean p3, p0, La/pi4;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/pi4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, p0, La/pi4;->d:Z

    .line 5
    .line 6
    iget-object v3, p0, La/pi4;->c:La/l7m0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v11, p1

    .line 12
    check-cast v11, La/fet;

    .line 13
    .line 14
    move-object/from16 v0, p2

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    and-int/lit8 v4, v0, 0x3

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x0

    .line 26
    if-eq v4, v5, :cond_0

    .line 27
    .line 28
    move v4, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v4, v6

    .line 31
    :goto_0
    and-int/2addr v0, v1

    .line 32
    invoke-virtual {v11, v0, v4}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    sget-object v0, La/qmk;->a:La/zcl;

    .line 39
    .line 40
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 41
    .line 42
    new-instance v5, La/qw3;

    .line 43
    .line 44
    new-instance v4, La/gne;

    .line 45
    .line 46
    const/16 v7, 0xc

    .line 47
    .line 48
    invoke-direct {v4, v0, v7}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    const/high16 v0, 0x40000000    # 2.0f

    .line 52
    .line 53
    invoke-direct {v5, v0, v1, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/qw3;

    .line 57
    .line 58
    new-instance v7, La/jf4;

    .line 59
    .line 60
    const/16 v8, 0xe

    .line 61
    .line 62
    invoke-direct {v7, v8}, La/jf4;-><init>(B)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, v0, v1, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, La/zvm;

    .line 69
    .line 70
    invoke-direct {v0, v6, v3, v2}, La/zvm;-><init>(BLa/l7m0;Z)V

    .line 71
    .line 72
    .line 73
    const v1, 0x5b37feaa

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    const/high16 v12, 0x180000

    .line 81
    .line 82
    const/16 v13, 0x38

    .line 83
    .line 84
    move-object v6, v4

    .line 85
    iget-object v4, p0, La/pi4;->b:La/mm40;

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    invoke-static/range {v4 .. v13}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    move-object v0, p1

    .line 101
    check-cast v0, La/fet;

    .line 102
    .line 103
    move-object/from16 v4, p2

    .line 104
    .line 105
    check-cast v4, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, La/x8x;->L(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iget-object p0, p0, La/pi4;->b:La/mm40;

    .line 115
    .line 116
    invoke-static {p0, v3, v2, v0, v1}, La/o050;->c(La/mm40;La/l7m0;ZLa/fet;I)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
