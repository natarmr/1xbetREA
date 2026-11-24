.class public final synthetic La/s4n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/qz3;

.field public final synthetic b:La/mm40;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:La/u12;

.field public final synthetic f:La/qge;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/qz3;La/mm40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s4n0;->a:La/qz3;

    iput-object p2, p0, La/s4n0;->b:La/mm40;

    iput-object p3, p0, La/s4n0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/s4n0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/s4n0;->e:La/u12;

    iput-object p6, p0, La/s4n0;->f:La/qge;

    iput-object p7, p0, La/s4n0;->g:La/ugd;

    iput p8, p0, La/s4n0;->h:I

    iput p9, p0, La/s4n0;->i:I

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
    iget p1, p0, La/s4n0;->h:I

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
    iget p1, p0, La/s4n0;->i:I

    .line 18
    .line 19
    invoke-static {p1}, La/x8x;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    iget-object v0, p0, La/s4n0;->a:La/qz3;

    .line 24
    .line 25
    iget-object v1, p0, La/s4n0;->b:La/mm40;

    .line 26
    .line 27
    iget-object v2, p0, La/s4n0;->c:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-object v3, p0, La/s4n0;->d:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-object v4, p0, La/s4n0;->e:La/u12;

    .line 32
    .line 33
    iget-object v5, p0, La/s4n0;->f:La/qge;

    .line 34
    .line 35
    iget-object v6, p0, La/s4n0;->g:La/ugd;

    .line 36
    .line 37
    invoke-static/range {v0 .. v9}, La/u4n0;->d(La/qz3;La/mm40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/ugd;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
