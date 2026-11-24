.class public final La/z090;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b190;


# direct methods
.method public synthetic constructor <init>(La/b190;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z090;->a:B

    iput-object p1, p0, La/z090;->b:La/b190;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/z090;->a:B

    iget-object p0, p0, La/z090;->b:La/b190;

    return-object p0
.end method
