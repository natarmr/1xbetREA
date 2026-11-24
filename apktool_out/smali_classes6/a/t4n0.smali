.class public final synthetic La/t4n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/pbe0;

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pm80;

.field public final synthetic d:La/u12;

.field public final synthetic e:La/qge;

.field public final synthetic f:F

.field public final synthetic g:La/a4d;

.field public final synthetic h:Z

.field public final synthetic i:I

.field public final synthetic j:S


# direct methods
.method public synthetic constructor <init>(La/pbe0;La/mm40;La/pm80;La/u12;La/qge;FLa/a4d;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t4n0;->a:La/pbe0;

    iput-object p2, p0, La/t4n0;->b:La/mm40;

    iput-object p3, p0, La/t4n0;->c:La/pm80;

    iput-object p4, p0, La/t4n0;->d:La/u12;

    iput-object p5, p0, La/t4n0;->e:La/qge;

    iput p6, p0, La/t4n0;->f:F

    iput-object p7, p0, La/t4n0;->g:La/a4d;

    iput-boolean p8, p0, La/t4n0;->h:Z

    iput p9, p0, La/t4n0;->i:I

    iput-short p10, p0, La/t4n0;->j:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/t4n0;->i:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/t4n0;->a:La/pbe0;

    .line 18
    .line 19
    iget-object v1, p0, La/t4n0;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/t4n0;->c:La/pm80;

    .line 22
    .line 23
    iget-object v3, p0, La/t4n0;->d:La/u12;

    .line 24
    .line 25
    iget-object v4, p0, La/t4n0;->e:La/qge;

    .line 26
    .line 27
    iget v5, p0, La/t4n0;->f:F

    .line 28
    .line 29
    iget-object v6, p0, La/t4n0;->g:La/a4d;

    .line 30
    .line 31
    iget-boolean v7, p0, La/t4n0;->h:Z

    .line 32
    .line 33
    iget-short v10, p0, La/t4n0;->j:S

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, La/u4n0;->e(La/pbe0;La/mm40;La/pm80;La/u12;La/qge;FLa/a4d;ZLa/fet;II)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method
