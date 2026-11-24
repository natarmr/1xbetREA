.class public final La/hef;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/cfq;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/ugd;

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;II)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hef;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, La/hef;->b:La/mm40;

    .line 4
    .line 5
    iput-object p3, p0, La/hef;->c:La/cfq;

    .line 6
    .line 7
    iput-object p4, p0, La/hef;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, La/hef;->e:La/ugd;

    .line 10
    .line 11
    iput p6, p0, La/hef;->f:I

    .line 12
    .line 13
    iput-byte p7, p0, La/hef;->g:B

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/hef;->f:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-byte v7, p0, La/hef;->g:B

    .line 18
    .line 19
    iget-object v0, p0, La/hef;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v1, p0, La/hef;->b:La/mm40;

    .line 22
    .line 23
    iget-object v2, p0, La/hef;->c:La/cfq;

    .line 24
    .line 25
    iget-object v3, p0, La/hef;->d:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, p0, La/hef;->e:La/ugd;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, La/jwb;->e(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
