.class public final La/x620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a720;


# direct methods
.method public synthetic constructor <init>(La/a720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x620;->a:B

    iput-object p1, p0, La/x620;->b:La/a720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x620;->a:B

    iget-object p0, p0, La/x620;->b:La/a720;

    return-object p0
.end method
