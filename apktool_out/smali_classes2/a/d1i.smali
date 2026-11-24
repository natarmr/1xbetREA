.class public final synthetic La/d1i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:La/pm80;

.field public final synthetic e:La/y3d;

.field public final synthetic f:La/y3d;

.field public final synthetic g:La/qge;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;ILa/pm80;La/y3d;La/y3d;La/qge;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d1i;->a:La/mm40;

    iput-object p2, p0, La/d1i;->b:Ljava/lang/Object;

    iput p3, p0, La/d1i;->c:I

    iput-object p4, p0, La/d1i;->d:La/pm80;

    iput-object p5, p0, La/d1i;->e:La/y3d;

    iput-object p6, p0, La/d1i;->f:La/y3d;

    iput-object p7, p0, La/d1i;->g:La/qge;

    iput p8, p0, La/d1i;->h:I

    iput-byte p9, p0, La/d1i;->i:B

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
    iget p1, p0, La/d1i;->h:I

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
    iget-object v0, p0, La/d1i;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/d1i;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, p0, La/d1i;->c:I

    .line 22
    .line 23
    iget-object v3, p0, La/d1i;->d:La/pm80;

    .line 24
    .line 25
    iget-object v4, p0, La/d1i;->e:La/y3d;

    .line 26
    .line 27
    iget-object v5, p0, La/d1i;->f:La/y3d;

    .line 28
    .line 29
    iget-object v6, p0, La/d1i;->g:La/qge;

    .line 30
    .line 31
    iget-byte v9, p0, La/d1i;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/jiq0;->F(La/mm40;Ljava/lang/Object;ILa/pm80;La/y3d;La/y3d;La/qge;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
