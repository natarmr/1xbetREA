.class public final synthetic La/w5h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:J

.field public final synthetic c:La/b7h;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I

.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(La/mm40;JLa/b7h;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w5h;->a:La/mm40;

    iput-wide p2, p0, La/w5h;->b:J

    iput-object p4, p0, La/w5h;->c:La/b7h;

    iput-boolean p5, p0, La/w5h;->d:Z

    iput-object p6, p0, La/w5h;->e:Ljava/lang/String;

    iput-object p7, p0, La/w5h;->f:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/w5h;->g:I

    iput-byte p9, p0, La/w5h;->h:B

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
    iget p1, p0, La/w5h;->g:I

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
    iget-object v0, p0, La/w5h;->a:La/mm40;

    .line 18
    .line 19
    iget-wide v1, p0, La/w5h;->b:J

    .line 20
    .line 21
    iget-object v3, p0, La/w5h;->c:La/b7h;

    .line 22
    .line 23
    iget-boolean v4, p0, La/w5h;->d:Z

    .line 24
    .line 25
    iget-object v5, p0, La/w5h;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, p0, La/w5h;->f:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-byte v9, p0, La/w5h;->h:B

    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, La/uzb;->a(La/mm40;JLa/b7h;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
