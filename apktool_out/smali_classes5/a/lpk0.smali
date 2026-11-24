.class public final synthetic La/lpk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jpk0;


# direct methods
.method public synthetic constructor <init>(La/jpk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lpk0;->a:B

    iput-object p1, p0, La/lpk0;->b:La/jpk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lpk0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lpk0;->b:La/jpk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/jpk0;->h:La/ipk0;

    .line 9
    .line 10
    iget-boolean v0, p0, La/ipk0;->c:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p0, La/ohk;->c:La/ohk;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean p0, p0, La/ipk0;->d:Z

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    sget-object p0, La/ohk;->a:La/ohk;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget-object p0, La/ohk;->b:La/ohk;

    .line 25
    .line 26
    :goto_0
    return-object p0

    .line 27
    :pswitch_0
    iget-object p0, p0, La/jpk0;->h:La/ipk0;

    .line 28
    .line 29
    iget-boolean p0, p0, La/ipk0;->c:Z

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const p0, 0x7f0802ed

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const p0, 0x7f0802eb

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
