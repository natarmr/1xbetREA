.class public final La/p63;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pzn;

.field public final synthetic d:La/alo;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:La/ugd;

.field public final synthetic g:I

.field public final synthetic h:B


# direct methods
.method public constructor <init>(ZLa/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;II)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/p63;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, La/p63;->b:La/mm40;

    .line 4
    .line 5
    iput-object p3, p0, La/p63;->c:La/pzn;

    .line 6
    .line 7
    iput-object p4, p0, La/p63;->d:La/alo;

    .line 8
    .line 9
    iput-object p5, p0, La/p63;->e:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, La/p63;->f:La/ugd;

    .line 12
    .line 13
    iput p7, p0, La/p63;->g:I

    .line 14
    .line 15
    iput-byte p8, p0, La/p63;->h:B

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/p63;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-byte v8, p0, La/p63;->h:B

    .line 18
    .line 19
    iget-boolean v0, p0, La/p63;->a:Z

    .line 20
    .line 21
    iget-object v1, p0, La/p63;->b:La/mm40;

    .line 22
    .line 23
    iget-object v2, p0, La/p63;->c:La/pzn;

    .line 24
    .line 25
    iget-object v3, p0, La/p63;->d:La/alo;

    .line 26
    .line 27
    iget-object v4, p0, La/p63;->e:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v5, p0, La/p63;->f:La/ugd;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, La/b34;->h(ZLa/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
