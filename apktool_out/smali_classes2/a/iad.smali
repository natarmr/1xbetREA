.class public final synthetic La/iad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:La/d9d0;

.field public final synthetic f:La/u12;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/xdr;

.field public final synthetic i:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZZLa/d9d0;La/u12;Lkotlin/jvm/functions/Function0;La/xdr;La/ugd;I)V
    .locals 0

    .line 1
    const/4 p9, 0x1

    iput-byte p9, p0, La/iad;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/iad;->b:La/mm40;

    iput-boolean p2, p0, La/iad;->c:Z

    iput-boolean p3, p0, La/iad;->d:Z

    iput-object p4, p0, La/iad;->e:La/d9d0;

    iput-object p5, p0, La/iad;->f:La/u12;

    iput-object p6, p0, La/iad;->g:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/iad;->h:La/xdr;

    iput-object p8, p0, La/iad;->i:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function0;La/mm40;La/d9d0;La/u12;La/xdr;La/ugd;I)V
    .locals 0

    .line 2
    const/4 p9, 0x0

    iput-byte p9, p0, La/iad;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/iad;->c:Z

    iput-boolean p2, p0, La/iad;->d:Z

    iput-object p3, p0, La/iad;->g:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/iad;->b:La/mm40;

    iput-object p5, p0, La/iad;->e:La/d9d0;

    iput-object p6, p0, La/iad;->f:La/u12;

    iput-object p7, p0, La/iad;->h:La/xdr;

    iput-object p8, p0, La/iad;->i:La/ugd;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/iad;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0xc00001

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, La/iad;->f:La/u12;

    .line 22
    .line 23
    iget-object v3, p0, La/iad;->i:La/ugd;

    .line 24
    .line 25
    iget-object v4, p0, La/iad;->h:La/xdr;

    .line 26
    .line 27
    iget-object v6, p0, La/iad;->b:La/mm40;

    .line 28
    .line 29
    iget-object v7, p0, La/iad;->e:La/d9d0;

    .line 30
    .line 31
    iget-object v8, p0, La/iad;->g:Lkotlin/jvm/functions/Function0;

    .line 32
    .line 33
    iget-boolean v9, p0, La/iad;->c:Z

    .line 34
    .line 35
    iget-boolean v10, p0, La/iad;->d:Z

    .line 36
    .line 37
    invoke-static/range {v1 .. v10}, La/ucx;->C(ILa/u12;La/ugd;La/xdr;La/fet;La/mm40;La/d9d0;Lkotlin/jvm/functions/Function0;ZZ)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    move-object v4, p1

    .line 44
    check-cast v4, La/fet;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const p1, 0xd80c01

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, La/iad;->f:La/u12;

    .line 59
    .line 60
    iget-object v2, p0, La/iad;->i:La/ugd;

    .line 61
    .line 62
    iget-object v3, p0, La/iad;->h:La/xdr;

    .line 63
    .line 64
    iget-object v5, p0, La/iad;->b:La/mm40;

    .line 65
    .line 66
    iget-object v6, p0, La/iad;->e:La/d9d0;

    .line 67
    .line 68
    iget-object v7, p0, La/iad;->g:Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    iget-boolean v8, p0, La/iad;->c:Z

    .line 71
    .line 72
    iget-boolean v9, p0, La/iad;->d:Z

    .line 73
    .line 74
    invoke-static/range {v0 .. v9}, La/oja0;->L(ILa/u12;La/ugd;La/xdr;La/fet;La/mm40;La/d9d0;Lkotlin/jvm/functions/Function0;ZZ)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
