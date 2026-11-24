.class public final synthetic La/lol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:La/qol;

.field public final synthetic h:La/tol;

.field public final synthetic i:La/iol;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(La/mm40;IIIILa/qol;La/tol;La/iol;IB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/lol;->a:B

    iput-object p1, p0, La/lol;->b:La/mm40;

    iput p2, p0, La/lol;->c:I

    iput p3, p0, La/lol;->d:I

    iput p4, p0, La/lol;->e:I

    iput p5, p0, La/lol;->f:I

    iput-object p6, p0, La/lol;->g:La/qol;

    iput-object p7, p0, La/lol;->h:La/tol;

    iput-object p8, p0, La/lol;->i:La/iol;

    iput p9, p0, La/lol;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/lol;->a:B

    .line 2
    .line 3
    iget v1, p0, La/lol;->j:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v10, p1

    .line 9
    check-cast v10, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    iget-object v2, p0, La/lol;->b:La/mm40;

    .line 23
    .line 24
    iget v3, p0, La/lol;->c:I

    .line 25
    .line 26
    iget v4, p0, La/lol;->d:I

    .line 27
    .line 28
    iget v5, p0, La/lol;->e:I

    .line 29
    .line 30
    iget v6, p0, La/lol;->f:I

    .line 31
    .line 32
    iget-object v7, p0, La/lol;->g:La/qol;

    .line 33
    .line 34
    iget-object v8, p0, La/lol;->h:La/tol;

    .line 35
    .line 36
    iget-object v9, p0, La/lol;->i:La/iol;

    .line 37
    .line 38
    invoke-static/range {v2 .. v11}, La/dyb;->o(La/mm40;IIIILa/qol;La/tol;La/iol;La/fet;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v8, p1

    .line 45
    check-cast v8, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    or-int/lit8 p1, v1, 0x1

    .line 53
    .line 54
    invoke-static {p1}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    iget-object v0, p0, La/lol;->b:La/mm40;

    .line 59
    .line 60
    iget v1, p0, La/lol;->c:I

    .line 61
    .line 62
    iget v2, p0, La/lol;->d:I

    .line 63
    .line 64
    iget v3, p0, La/lol;->e:I

    .line 65
    .line 66
    iget v4, p0, La/lol;->f:I

    .line 67
    .line 68
    iget-object v5, p0, La/lol;->g:La/qol;

    .line 69
    .line 70
    iget-object v6, p0, La/lol;->h:La/tol;

    .line 71
    .line 72
    iget-object v7, p0, La/lol;->i:La/iol;

    .line 73
    .line 74
    invoke-static/range {v0 .. v9}, La/wwb;->h(La/mm40;IIIILa/qol;La/tol;La/iol;La/fet;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
