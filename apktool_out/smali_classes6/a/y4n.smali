.class public final synthetic La/y4n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/s6x;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/s6x;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y4n;->a:La/mm40;

    iput-object p2, p0, La/y4n;->b:La/s6x;

    iput p3, p0, La/y4n;->c:I

    iput p4, p0, La/y4n;->d:I

    iput-byte p5, p0, La/y4n;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-byte p1, p0, La/y4n;->e:B

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, La/y4n;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/y4n;->b:La/s6x;

    .line 20
    .line 21
    iget v2, p0, La/y4n;->c:I

    .line 22
    .line 23
    iget v3, p0, La/y4n;->d:I

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, La/xkb;->r(La/mm40;La/s6x;IILa/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
