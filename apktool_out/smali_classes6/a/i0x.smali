.class public final synthetic La/i0x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/pm80;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/u12;

.field public final synthetic e:La/qge;

.field public final synthetic f:F

.field public final synthetic g:La/a4d;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/i0x;->a:La/pm80;

    iput-object p2, p0, La/i0x;->b:Ljava/lang/String;

    iput-object p3, p0, La/i0x;->c:La/mm40;

    iput-object p4, p0, La/i0x;->d:La/u12;

    iput-object p5, p0, La/i0x;->e:La/qge;

    iput p6, p0, La/i0x;->f:F

    iput-object p7, p0, La/i0x;->g:La/a4d;

    iput p8, p0, La/i0x;->h:I

    iput-byte p9, p0, La/i0x;->i:B

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
    iget p1, p0, La/i0x;->h:I

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
    iget-object v0, p0, La/i0x;->a:La/pm80;

    .line 18
    .line 19
    iget-object v1, p0, La/i0x;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La/i0x;->c:La/mm40;

    .line 22
    .line 23
    iget-object v3, p0, La/i0x;->d:La/u12;

    .line 24
    .line 25
    iget-object v4, p0, La/i0x;->e:La/qge;

    .line 26
    .line 27
    iget v5, p0, La/i0x;->f:F

    .line 28
    .line 29
    iget-object v6, p0, La/i0x;->g:La/a4d;

    .line 30
    .line 31
    iget-byte v9, p0, La/i0x;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
