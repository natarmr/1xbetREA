.class public final synthetic La/ofe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/mm40;

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;III)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ofe;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ofe;->f:Ljava/lang/Object;

    iput-object p2, p0, La/ofe;->c:La/mm40;

    iput-object p3, p0, La/ofe;->g:Ljava/lang/Object;

    iput p4, p0, La/ofe;->b:I

    iput p5, p0, La/ofe;->d:I

    iput-byte p6, p0, La/ofe;->e:B

    return-void
.end method

.method public synthetic constructor <init>(La/u1m;La/ope;ILa/mm40;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ofe;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ofe;->f:Ljava/lang/Object;

    iput-object p2, p0, La/ofe;->g:Ljava/lang/Object;

    iput p3, p0, La/ofe;->b:I

    iput-object p4, p0, La/ofe;->c:La/mm40;

    iput p5, p0, La/ofe;->d:I

    iput-byte p6, p0, La/ofe;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ofe;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ofe;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/ofe;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/ofe;->f:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, La/u1m;

    .line 14
    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, La/ope;

    .line 17
    .line 18
    move-object v8, p1

    .line 19
    check-cast v8, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget v6, p0, La/ofe;->b:I

    .line 33
    .line 34
    iget-object v7, p0, La/ofe;->c:La/mm40;

    .line 35
    .line 36
    iget-byte v10, p0, La/ofe;->e:B

    .line 37
    .line 38
    invoke-static/range {v4 .. v10}, La/l8x;->g(La/u1m;La/ope;ILa/mm40;La/fet;II)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v0, v3

    .line 45
    check-cast v0, La/a4x;

    .line 46
    .line 47
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    move-object v4, p1

    .line 50
    check-cast v4, La/fet;

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    or-int/lit8 p1, v1, 0x1

    .line 58
    .line 59
    invoke-static {p1}, La/x8x;->L(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget-object v1, p0, La/ofe;->c:La/mm40;

    .line 64
    .line 65
    iget v3, p0, La/ofe;->b:I

    .line 66
    .line 67
    iget-byte v6, p0, La/ofe;->e:B

    .line 68
    .line 69
    invoke-static/range {v0 .. v6}, La/gkb;->c(La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;ILa/fet;II)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
