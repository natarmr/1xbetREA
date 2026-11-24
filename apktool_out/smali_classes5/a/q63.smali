.class public final La/q63;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/y5d;

.field public final synthetic b:Z

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/pzn;

.field public final synthetic e:La/alo;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public constructor <init>(La/y5d;ZLa/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;II)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q63;->a:La/y5d;

    .line 2
    .line 3
    iput-boolean p2, p0, La/q63;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, La/q63;->c:La/mm40;

    .line 6
    .line 7
    iput-object p4, p0, La/q63;->d:La/pzn;

    .line 8
    .line 9
    iput-object p5, p0, La/q63;->e:La/alo;

    .line 10
    .line 11
    iput-object p6, p0, La/q63;->f:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, La/q63;->g:La/ugd;

    .line 14
    .line 15
    iput p8, p0, La/q63;->h:I

    .line 16
    .line 17
    iput-byte p9, p0, La/q63;->i:B

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 21
    .line 22
    .line 23
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
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/q63;->h:I

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
    iget-byte v9, p0, La/q63;->i:B

    .line 18
    .line 19
    iget-object v0, p0, La/q63;->a:La/y5d;

    .line 20
    .line 21
    iget-boolean v1, p0, La/q63;->b:Z

    .line 22
    .line 23
    iget-object v2, p0, La/q63;->c:La/mm40;

    .line 24
    .line 25
    iget-object v3, p0, La/q63;->d:La/pzn;

    .line 26
    .line 27
    iget-object v4, p0, La/q63;->e:La/alo;

    .line 28
    .line 29
    iget-object v5, p0, La/q63;->f:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v6, p0, La/q63;->g:La/ugd;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/b34;->e(La/y5d;ZLa/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
