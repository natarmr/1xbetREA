.class public final synthetic La/fnm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:La/kly;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:S

.field public final synthetic i:La/jnm;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/jnm;ILa/kly;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/fnm;->a:B

    iput-object p1, p0, La/fnm;->b:La/mm40;

    iput-object p2, p0, La/fnm;->i:La/jnm;

    iput p3, p0, La/fnm;->c:I

    iput-object p4, p0, La/fnm;->d:La/kly;

    iput-object p5, p0, La/fnm;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/fnm;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/fnm;->g:Lkotlin/jvm/functions/Function1;

    iput-short p8, p0, La/fnm;->h:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/fnm;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/fnm;->i:La/jnm;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/inm;

    .line 10
    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-short p1, p0, La/fnm;->h:S

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-object v1, p0, La/fnm;->b:La/mm40;

    .line 28
    .line 29
    iget v3, p0, La/fnm;->c:I

    .line 30
    .line 31
    iget-object v4, p0, La/fnm;->d:La/kly;

    .line 32
    .line 33
    iget-object v5, p0, La/fnm;->e:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    iget-object v6, p0, La/fnm;->f:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    iget-object v7, p0, La/fnm;->g:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    invoke-static/range {v1 .. v9}, La/jwb;->l(La/mm40;La/inm;ILa/kly;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    iget-object v0, p0, La/fnm;->i:La/jnm;

    .line 46
    .line 47
    move-object v2, v0

    .line 48
    check-cast v2, La/hnm;

    .line 49
    .line 50
    move-object v8, p1

    .line 51
    check-cast v8, La/fet;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-short p1, p0, La/fnm;->h:S

    .line 59
    .line 60
    or-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    invoke-static {p1}, La/x8x;->L(I)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    iget-object v1, p0, La/fnm;->b:La/mm40;

    .line 67
    .line 68
    iget v3, p0, La/fnm;->c:I

    .line 69
    .line 70
    iget-object v4, p0, La/fnm;->d:La/kly;

    .line 71
    .line 72
    iget-object v5, p0, La/fnm;->e:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    iget-object v6, p0, La/fnm;->f:Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    iget-object v7, p0, La/fnm;->g:Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    invoke-static/range {v1 .. v9}, La/wvb;->q(La/mm40;La/hnm;ILa/kly;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
