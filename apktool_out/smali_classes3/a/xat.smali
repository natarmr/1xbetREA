.class public final synthetic La/xat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pbt;


# direct methods
.method public synthetic constructor <init>(La/pbt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xat;->a:B

    iput-object p1, p0, La/xat;->b:La/pbt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xat;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/xat;->b:La/pbt;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/pbt;->f:La/r2t;

    .line 13
    .line 14
    iget-object p0, p0, La/r2t;->a:La/p7m0;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, La/pbt;->c:La/g7d;

    .line 23
    .line 24
    iput-boolean v1, p0, La/g7d;->c:Z

    .line 25
    .line 26
    iput-object v2, p0, La/g7d;->e:La/jzj;

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    iget-object p0, p0, La/pbt;->c:La/g7d;

    .line 32
    .line 33
    iput-boolean v1, p0, La/g7d;->c:Z

    .line 34
    .line 35
    iput-object v2, p0, La/g7d;->e:La/jzj;

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
