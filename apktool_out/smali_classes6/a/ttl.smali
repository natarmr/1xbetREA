.class public final synthetic La/ttl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/ro8;

.field public final synthetic d:B

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:I

.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/ro8;IJJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ttl;->a:La/mm40;

    iput-object p2, p0, La/ttl;->b:Ljava/lang/String;

    iput-object p3, p0, La/ttl;->c:La/ro8;

    iput-byte p4, p0, La/ttl;->d:B

    iput-wide p5, p0, La/ttl;->e:J

    iput-wide p7, p0, La/ttl;->f:J

    iput p9, p0, La/ttl;->g:I

    iput-byte p10, p0, La/ttl;->h:B

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
    iget p1, p0, La/ttl;->g:I

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
    iget-object v0, p0, La/ttl;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/ttl;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La/ttl;->c:La/ro8;

    .line 22
    .line 23
    iget-byte v3, p0, La/ttl;->d:B

    .line 24
    .line 25
    iget-wide v4, p0, La/ttl;->e:J

    .line 26
    .line 27
    iget-wide v6, p0, La/ttl;->f:J

    .line 28
    .line 29
    iget-byte v10, p0, La/ttl;->h:B

    .line 30
    .line 31
    invoke-static/range {v0 .. v10}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
