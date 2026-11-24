.class public final synthetic La/aul0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:La/xdr;

.field public final synthetic e:La/xdr;

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZLa/xdr;La/xdr;La/ugd;La/ugd;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/aul0;->a:B

    iput-object p1, p0, La/aul0;->b:La/mm40;

    iput-boolean p2, p0, La/aul0;->c:Z

    iput-object p3, p0, La/aul0;->d:La/xdr;

    iput-object p4, p0, La/aul0;->e:La/xdr;

    iput-object p5, p0, La/aul0;->f:La/ugd;

    iput-object p6, p0, La/aul0;->g:La/ugd;

    iput-object p7, p0, La/aul0;->h:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/aul0;->a:B

    .line 2
    .line 3
    const v1, 0x1b6001

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v9, p1

    .line 10
    check-cast v9, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    iget-object v2, p0, La/aul0;->b:La/mm40;

    .line 22
    .line 23
    iget-boolean v3, p0, La/aul0;->c:Z

    .line 24
    .line 25
    iget-object v4, p0, La/aul0;->d:La/xdr;

    .line 26
    .line 27
    iget-object v5, p0, La/aul0;->e:La/xdr;

    .line 28
    .line 29
    iget-object v6, p0, La/aul0;->f:La/ugd;

    .line 30
    .line 31
    iget-object v7, p0, La/aul0;->g:La/ugd;

    .line 32
    .line 33
    iget-object v8, p0, La/aul0;->h:La/ugd;

    .line 34
    .line 35
    invoke-static/range {v2 .. v10}, La/qxw;->q(La/mm40;ZLa/xdr;La/xdr;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    move-object v7, p1

    .line 42
    check-cast v7, La/fet;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    iget-object v0, p0, La/aul0;->b:La/mm40;

    .line 54
    .line 55
    iget-boolean v1, p0, La/aul0;->c:Z

    .line 56
    .line 57
    iget-object v2, p0, La/aul0;->d:La/xdr;

    .line 58
    .line 59
    iget-object v3, p0, La/aul0;->e:La/xdr;

    .line 60
    .line 61
    iget-object v4, p0, La/aul0;->f:La/ugd;

    .line 62
    .line 63
    iget-object v5, p0, La/aul0;->g:La/ugd;

    .line 64
    .line 65
    iget-object v6, p0, La/aul0;->h:La/ugd;

    .line 66
    .line 67
    invoke-static/range {v0 .. v8}, La/xww;->p(La/mm40;ZLa/xdr;La/xdr;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
