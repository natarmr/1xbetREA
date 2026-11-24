.class public final La/ckh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hb50;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sgy;

.field public final synthetic c:La/jiy;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/sgy;Lkotlin/jvm/functions/Function2;La/jiy;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ckh;->a:B

    iput-object p1, p0, La/ckh;->b:La/sgy;

    iput-object p2, p0, La/ckh;->d:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, La/ckh;->c:La/jiy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/nw20;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/ckh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ckh;->c:La/jiy;

    .line 4
    .line 5
    iget-object p0, p0, La/ckh;->b:La/sgy;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/phf0;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/ckh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ckh;->d:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const v3, 0xad72357

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/ckh;->b:La/sgy;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/pnk0;->d:La/pnk0;

    .line 15
    .line 16
    sget-object v4, La/pnk0;->e:La/pnk0;

    .line 17
    .line 18
    new-instance v5, La/bkh;

    .line 19
    .line 20
    check-cast v1, La/gcl0;

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    invoke-direct {v5, v1, v6}, La/bkh;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/ugd;

    .line 27
    .line 28
    invoke-direct {v1, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0, v0, v4, v1}, La/phf0;->a(La/sgy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    sget-object v0, La/ske;->j:La/ske;

    .line 36
    .line 37
    sget-object v4, La/ske;->k:La/ske;

    .line 38
    .line 39
    new-instance v5, La/bkh;

    .line 40
    .line 41
    check-cast v1, La/p1h;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-direct {v5, v1, v6}, La/bkh;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    new-instance v1, La/ugd;

    .line 48
    .line 49
    invoke-direct {v1, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0, v0, v4, v1}, La/phf0;->a(La/sgy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
