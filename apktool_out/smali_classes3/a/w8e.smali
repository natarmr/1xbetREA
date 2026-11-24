.class public final synthetic La/w8e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fae;


# direct methods
.method public synthetic constructor <init>(La/fae;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w8e;->a:B

    iput-object p1, p0, La/w8e;->b:La/fae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/w8e;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/w8e;->b:La/fae;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/fae;->l:La/sa10;

    .line 9
    .line 10
    sget-object v2, La/pb10;->g:La/pb10;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/16 v6, 0x1c

    .line 14
    .line 15
    const v3, 0x7f1307c4

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    iget-object p0, p0, La/fae;->K:La/ol60;

    .line 25
    .line 26
    new-instance v0, La/g9e;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, La/g9e;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    iget-object p0, p0, La/fae;->A:La/zj2;

    .line 39
    .line 40
    sget-object v0, La/e9e;->a:La/e9e;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, La/zj2;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
