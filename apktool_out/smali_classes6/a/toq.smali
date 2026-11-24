.class public final synthetic La/toq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/ow3;

.field public final synthetic c:La/sw3;

.field public final synthetic d:La/yx7;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/toq;->a:La/mm40;

    iput-object p2, p0, La/toq;->b:La/ow3;

    iput-object p3, p0, La/toq;->c:La/sw3;

    iput-object p4, p0, La/toq;->d:La/yx7;

    iput p5, p0, La/toq;->e:I

    iput p6, p0, La/toq;->f:I

    iput-object p7, p0, La/toq;->g:La/ugd;

    iput p8, p0, La/toq;->h:I

    iput-byte p9, p0, La/toq;->i:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/toq;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, La/toq;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/toq;->b:La/ow3;

    .line 20
    .line 21
    iget-object v2, p0, La/toq;->c:La/sw3;

    .line 22
    .line 23
    iget-object v3, p0, La/toq;->d:La/yx7;

    .line 24
    .line 25
    iget v4, p0, La/toq;->e:I

    .line 26
    .line 27
    iget v5, p0, La/toq;->f:I

    .line 28
    .line 29
    iget-object v6, p0, La/toq;->g:La/ugd;

    .line 30
    .line 31
    iget-byte v9, p0, La/toq;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
