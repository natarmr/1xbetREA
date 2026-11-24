.class public final synthetic La/np00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp00;


# direct methods
.method public synthetic constructor <init>(La/cp00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/np00;->a:B

    iput-object p1, p0, La/np00;->b:La/cp00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/np00;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/np00;->b:La/cp00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/cp00;->m:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, La/phk;->c:La/phk;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean p0, p0, La/cp00;->n:Z

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    sget-object p0, La/phk;->a:La/phk;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-object p0, La/phk;->b:La/phk;

    .line 23
    .line 24
    :goto_0
    return-object p0

    .line 25
    :pswitch_0
    iget-object p0, p0, La/cp00;->c:La/hh3;

    .line 26
    .line 27
    iget-object p0, p0, La/hh3;->a:La/gh3;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_6

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    if-eq p0, v0, :cond_5

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    if-eq p0, v0, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    if-eq p0, v0, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x4

    .line 45
    if-ne p0, v0, :cond_2

    .line 46
    .line 47
    sget-object p0, La/eub0;->e:La/eub0;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    sget-object p0, La/eub0;->d:La/eub0;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    sget-object p0, La/eub0;->c:La/eub0;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    sget-object p0, La/eub0;->a:La/eub0;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    sget-object p0, La/eub0;->b:La/eub0;

    .line 65
    .line 66
    :goto_1
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
