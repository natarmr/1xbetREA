.class public final synthetic La/rtl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:B

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/jwm;La/jwm;La/jwm;JII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/rtl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rtl;->b:La/mm40;

    iput-object p2, p0, La/rtl;->f:Ljava/lang/Object;

    iput-object p3, p0, La/rtl;->g:Ljava/lang/Object;

    iput-object p4, p0, La/rtl;->h:Ljava/lang/Object;

    iput-wide p5, p0, La/rtl;->c:J

    iput-byte p7, p0, La/rtl;->d:B

    iput-byte p8, p0, La/rtl;->e:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/vul;La/wul;JLkotlin/jvm/functions/Function0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/rtl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rtl;->b:La/mm40;

    iput-object p2, p0, La/rtl;->f:Ljava/lang/Object;

    iput-object p3, p0, La/rtl;->g:Ljava/lang/Object;

    iput-wide p4, p0, La/rtl;->c:J

    iput-object p6, p0, La/rtl;->h:Ljava/lang/Object;

    iput-byte p7, p0, La/rtl;->d:B

    iput-byte p8, p0, La/rtl;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/rtl;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/rtl;->d:B

    .line 4
    .line 5
    iget-object v2, p0, La/rtl;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/rtl;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/rtl;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v6, v4

    .line 15
    check-cast v6, La/jwm;

    .line 16
    .line 17
    move-object v7, v3

    .line 18
    check-cast v7, La/jwm;

    .line 19
    .line 20
    move-object v8, v2

    .line 21
    check-cast v8, La/jwm;

    .line 22
    .line 23
    move-object v11, p1

    .line 24
    check-cast v11, La/fet;

    .line 25
    .line 26
    move-object/from16 v0, p2

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    or-int/lit8 v0, v1, 0x1

    .line 34
    .line 35
    invoke-static {v0}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    iget-object v5, p0, La/rtl;->b:La/mm40;

    .line 40
    .line 41
    iget-wide v9, p0, La/rtl;->c:J

    .line 42
    .line 43
    iget-byte v13, p0, La/rtl;->e:B

    .line 44
    .line 45
    invoke-static/range {v5 .. v13}, La/tlb;->l(La/mm40;La/jwm;La/jwm;La/jwm;JLa/fet;II)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    check-cast v4, La/vul;

    .line 52
    .line 53
    check-cast v3, La/wul;

    .line 54
    .line 55
    move-object v5, v2

    .line 56
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    move-object v6, p1

    .line 59
    check-cast v6, La/fet;

    .line 60
    .line 61
    move-object/from16 v0, p2

    .line 62
    .line 63
    check-cast v0, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    or-int/lit8 v0, v1, 0x1

    .line 69
    .line 70
    invoke-static {v0}, La/x8x;->L(I)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iget-object v0, p0, La/rtl;->b:La/mm40;

    .line 75
    .line 76
    move-object v2, v3

    .line 77
    move-object v1, v4

    .line 78
    iget-wide v3, p0, La/rtl;->c:J

    .line 79
    .line 80
    iget-byte v8, p0, La/rtl;->e:B

    .line 81
    .line 82
    invoke-static/range {v0 .. v8}, La/ckb;->i(La/mm40;La/vul;La/wul;JLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
