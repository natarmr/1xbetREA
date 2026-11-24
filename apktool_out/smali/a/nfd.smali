.class public final synthetic La/nfd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jgd;
.implements La/sg00;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ft2;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    iput-byte p1, p0, La/nfd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/nfd;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/nfd;->a:B

    iput-object p1, p0, La/nfd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/gt2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x0(La/pzu;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p1, p0, La/nfd;->a:B

    iget-object p0, p0, La/nfd;->b:Ljava/lang/Object;

    return-object p0
.end method
