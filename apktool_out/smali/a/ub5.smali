.class public final La/ub5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/olz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/nlz;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ub5;->a:B

    iput-object p2, p0, La/ub5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/ub5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ub5;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/ckd;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, La/ckd;->Q(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_1
    check-cast p0, La/uhd;

    .line 24
    .line 25
    iget-object v0, p0, La/c2;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/v62;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/eg60;->f(Z)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/qb5;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/af50;->i(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
