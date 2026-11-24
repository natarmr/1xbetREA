.class public final synthetic La/np8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xpj0;

.field public final synthetic c:La/nul0;

.field public final synthetic d:La/nul0;

.field public final synthetic e:La/nul0;


# direct methods
.method public synthetic constructor <init>(La/xpj0;La/nul0;La/nul0;La/nul0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/np8;->a:B

    iput-object p1, p0, La/np8;->b:La/xpj0;

    iput-object p2, p0, La/np8;->c:La/nul0;

    iput-object p3, p0, La/np8;->d:La/nul0;

    iput-object p4, p0, La/np8;->e:La/nul0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/np8;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/np8;->e:La/nul0;

    .line 4
    .line 5
    iget-object v2, p0, La/np8;->d:La/nul0;

    .line 6
    .line 7
    iget-object v3, p0, La/np8;->c:La/nul0;

    .line 8
    .line 9
    iget-object p0, p0, La/np8;->b:La/xpj0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iput-object v3, p0, La/xpj0;->f:La/cfq;

    .line 15
    .line 16
    iput-object v2, p0, La/xpj0;->g:La/cfq;

    .line 17
    .line 18
    iput-object v1, p0, La/xpj0;->d:La/cfq;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iput-object v3, p0, La/xpj0;->f:La/cfq;

    .line 24
    .line 25
    iput-object v2, p0, La/xpj0;->g:La/cfq;

    .line 26
    .line 27
    iput-object v1, p0, La/xpj0;->d:La/cfq;

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
