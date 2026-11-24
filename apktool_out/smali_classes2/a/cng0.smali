.class public final synthetic La/cng0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:La/hh80;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;ZZZLa/hh80;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cng0;->a:La/mm40;

    iput-object p2, p0, La/cng0;->b:La/l7m0;

    iput-boolean p3, p0, La/cng0;->c:Z

    iput-boolean p4, p0, La/cng0;->d:Z

    iput-boolean p5, p0, La/cng0;->e:Z

    iput-object p6, p0, La/cng0;->f:La/hh80;

    iput-object p7, p0, La/cng0;->g:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/cng0;->h:I

    iput-byte p9, p0, La/cng0;->i:B

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
    iget p1, p0, La/cng0;->h:I

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
    iget-object v0, p0, La/cng0;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/cng0;->b:La/l7m0;

    .line 20
    .line 21
    iget-boolean v2, p0, La/cng0;->c:Z

    .line 22
    .line 23
    iget-boolean v3, p0, La/cng0;->d:Z

    .line 24
    .line 25
    iget-boolean v4, p0, La/cng0;->e:Z

    .line 26
    .line 27
    iget-object v5, p0, La/cng0;->f:La/hh80;

    .line 28
    .line 29
    iget-object v6, p0, La/cng0;->g:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-byte v9, p0, La/cng0;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/piz;->x(La/mm40;La/l7m0;ZZZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
