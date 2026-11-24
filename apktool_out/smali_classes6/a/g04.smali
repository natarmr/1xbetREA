.class public final synthetic La/g04;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:S

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:La/wdr;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/wdr;IIB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/g04;->a:B

    iput-object p1, p0, La/g04;->e:Ljava/lang/Object;

    iput-object p2, p0, La/g04;->f:Ljava/lang/Object;

    iput-object p3, p0, La/g04;->g:Ljava/lang/Object;

    iput-object p4, p0, La/g04;->b:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/g04;->h:La/wdr;

    iput-short p6, p0, La/g04;->c:S

    iput-byte p7, p0, La/g04;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/g04;->a:B

    .line 2
    .line 3
    iget-short v1, p0, La/g04;->c:S

    .line 4
    .line 5
    iget-object v2, p0, La/g04;->h:La/wdr;

    .line 6
    .line 7
    iget-object v3, p0, La/g04;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/g04;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/g04;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, v5

    .line 17
    check-cast v6, La/mm40;

    .line 18
    .line 19
    move-object v7, v4

    .line 20
    check-cast v7, La/gzh;

    .line 21
    .line 22
    move-object v8, v3

    .line 23
    check-cast v8, La/azh;

    .line 24
    .line 25
    move-object v10, v2

    .line 26
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    move-object v11, p1

    .line 29
    check-cast v11, La/fet;

    .line 30
    .line 31
    move-object/from16 v0, p2

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    or-int/lit8 v0, v1, 0x1

    .line 39
    .line 40
    invoke-static {v0}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    iget-object v9, p0, La/g04;->b:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    iget-byte v13, p0, La/g04;->d:B

    .line 47
    .line 48
    invoke-static/range {v6 .. v13}, La/gq80;->p(La/mm40;La/gzh;La/azh;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    move-object v0, v5

    .line 55
    check-cast v0, La/o0x;

    .line 56
    .line 57
    check-cast v4, La/o0x;

    .line 58
    .line 59
    check-cast v3, La/m0x;

    .line 60
    .line 61
    check-cast v2, La/ugd;

    .line 62
    .line 63
    move-object v5, p1

    .line 64
    check-cast v5, La/fet;

    .line 65
    .line 66
    move-object/from16 v6, p2

    .line 67
    .line 68
    check-cast v6, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    or-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    invoke-static {v1}, La/x8x;->L(I)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    move-object v1, v4

    .line 80
    move-object v4, v2

    .line 81
    move-object v2, v3

    .line 82
    iget-object v3, p0, La/g04;->b:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-byte v7, p0, La/g04;->d:B

    .line 85
    .line 86
    invoke-static/range {v0 .. v7}, La/y9a;->f(La/o0x;La/o0x;La/m0x;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;II)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
