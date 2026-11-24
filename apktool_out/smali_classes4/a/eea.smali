.class public final synthetic La/eea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nea;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/nea;Lkotlin/jvm/functions/Function1;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/eea;->a:B

    iput-object p1, p0, La/eea;->b:La/nea;

    iput-object p2, p0, La/eea;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/eea;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/eea;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/eea;->d:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/eea;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object p0, p0, La/eea;->b:La/nea;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/nea;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, La/hea;->b:La/hea;

    .line 18
    .line 19
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object p0, p0, La/nea;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v1, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La/hea;->a:La/hea;

    .line 31
    .line 32
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
